#!/usr/bin/env bash

set -euox pipefail

WORKING_DIR="$(pwd)"
MY_DIR="$(cd "$(dirname "$0")" && pwd)"
pushd "${MY_DIR}" &>/dev/null || exit 1

if [[ "$#" -ne 2 ]]; then
    echo "You must provide at two arguments."
    echo
    exit 1
fi

OUTPUT=$1
SPEC=$2

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    --input-spec "/local/${SPEC}" \
    --generator-name "bash" \
    --output "/local/${OUTPUT}/bash" \
    --config /local/config-bash.yaml

docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    --input-spec "/local/${SPEC}" \
    --generator-name "python" \
    --output "/local/${OUTPUT}/python" \
    --config /local/config-python.yaml

cat java-libraries.txt | xargs -n 1 -I {} -t docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    --input-spec "/local/${SPEC}" \
    --generator-name "java" \
    --output "/local/${OUTPUT}/java-{}" \
    --config /local/config-java-{}.yaml

cat all-clients.txt | xargs -n 1 -I {} -t docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    --input-spec "/local/${SPEC}" \
    --generator-name {} \
    --output "/local/${OUTPUT}/{}"
