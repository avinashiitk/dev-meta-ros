#!/bin/bash

export MCFFILES="build/files*/*warrior.mcf"

for i in ${MCFFILES}; do
    ID=`basename ${i/.mcf/}`
    ./build-one.sh $ID
done
