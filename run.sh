#!/bin/bash

docker build -t sc .
docker run -it sc bash
