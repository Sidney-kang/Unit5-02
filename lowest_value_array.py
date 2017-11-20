# Created by : Sidney Kang
# Created on : 11 Nov. 2017
# Created for : ICS3UR
# Daily Assignment - Unit5-01
# This program accepts any array as a parameter and returns largest value in array

def find_greatest_value(arrays = []):
   
    value_number_in_array = max(arrays)
                                
    return value_number_in_array                                 


array = [5,4,7,9,3,6]
find_greatest_value(array)

max_value = find_greatest_value(array)
print("The max value of the array is: " + str(max_value))
