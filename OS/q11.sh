#!/bin/bash

# Prompt the user to enter numbers
echo "Enter numbers (enter a negative number to exit):"

# Initialize the number variable
number=0

# Start the while loop
while true
do
  # Read a number from the user
  read number

  # Check if the number is negative
  if [ $number -lt 0 ]; then
    break
  fi

  # Calculate the square of the number
  square=$((number * number))

  # Print the square of the number
  echo "The square of $number is $square"
done

# Print a message indicating the loop has ended
echo "Negative number entered. Exiting the loop."

