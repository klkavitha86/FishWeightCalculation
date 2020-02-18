# FishWeightCalculation

Fish weight growth can be modeled as function of species' biophysical
characteristics and ambient water temperature. Given the current weight of a
fish (`weight_cur`), the new weight for a day's worth of growth in Alaskan
Salmon can be calculated as

    weight_new = (alpha * weight_cur^beta * e^(temp_cur * tau)) + weight_cur

where
    alpha = 0.038,
    beta = 0.6667,
    tau = 0.08,
    temp_cur is the current water temperature in degrees C,
    and the weight of the fish is in grams.

Please write a Python program that simulates a year's worth of growth given
the daily temperatures provided in `temperature_series.csv` and prints the
initial and final fish weight to the terminal. Initial fish weight can be
hard coded in the script.

The purpose of this problem is to give you a simple example of the type of
software we write, and for us as a rough gauge of your ability to interpret
and implement such a problem in Python.  When writing this script, please
focus on correctness, readability, and simplicity.
