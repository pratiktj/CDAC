#!/bin/bash

# Initialize the counter
i=1

# Loop while the counter is less than or equal to 5
while [ $i -le 5 ]
do
  echo $i
  i=$((i + 1))  # Increment the counter
done
