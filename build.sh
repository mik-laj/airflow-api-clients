#!/usr/bin/env bash

set -euox pipefail

WORKING_DIR="$(pwd)"
MY_DIR="$(cd "$(dirname "$0")" && pwd)"
pushd "${MY_DIR}" &>/dev/null || exit 1

SPEC_URL="https://raw.githubusercontent.com/PolideaInternal/airflow/openapi-spec/openapi.yaml"

if [[ ! -f main_spec.yaml ]]; then
    curl "${SPEC_URL}" > main_spec.yaml
    patch main_spec.yaml xcom_key.patch
    patch main_spec.yaml one_of.patch
fi 
#cp main_spec.yaml spec.yaml
#./build-clients.sh out/string/ spec.yaml

cp main_spec.yaml spec.yaml
patch  spec.yaml spec-object.patch
./build-clients.sh  out/object/ spec.yaml

#cp main_spec.yaml spec.yaml
#patch  spec.yaml spec-oneoff.patch
#./build-clients.sh out/oneoff/ spec.yaml 

