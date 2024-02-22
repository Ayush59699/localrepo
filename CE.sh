#!/bin/bash

env_name=".env"

if [ -d "$env_name" ]; then
    echo "Virtual environment '$env_name' already exists."
else
    python3 -m venv "$env_name"

    echo "Virtual environment '$env_name' Created & Activated."
fi


source $env_name/bin/activate
echo Hello
#pip install -r requirements.txt
