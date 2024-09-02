#!/bin/bash

# Print the header row
echo -e "\t1\t2\t3\t4\t5"

# Loop through numbers 1 to 5 for the rows
for i in {1..5}
do
  # Print the row header
  echo -n "$i"
  
  # Loop through numbers 1 to 5 for the columns
  for j in {1..5}
  do
    # Calculate the product and print it with a tab
    echo -ne "\t$((i * j))"
  done
  
  # Print a new line at the end of each row
  echo
done
