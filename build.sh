#!/usr/bin/env bash

set -euox pipefail

WORKING_DIR="$(pwd)"
MY_DIR="$(cd "$(dirname "$0")" && pwd)"
pushd "${MY_DIR}" &>/dev/null || exit 1

SPEC_URL="https://raw.githubusercontent.com/PolideaInternal/airflow/openapi-spec/openapi.yaml"

curl "${SPEC_URL}" > spec.yaml
./build-clients.sh out/string/ spec.yaml

curl "${SPEC_URL}" > spec.yaml
patch  spec.yaml spec-object.patch
./build-clients.sh  out/object/ spec.yaml

curl "${SPEC_URL}" > spec.yaml
patch  spec.yaml spec-oneoff.patch
./build-clients.sh out/oneoff/ spec.yaml 

rm spec.yaml