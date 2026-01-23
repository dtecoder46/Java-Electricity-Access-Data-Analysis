# Electricity Access Analysis Project
A Java data analysis project designed to answer questions on a school electricity access dataset from Kaggle

## Research Questions
1. Which country had/has the worst school electricity access percentage?
2. How did school electricity access in Cote d’Ivoire change over time?
3. On average, how does electricity access in Cote d’Ivoire compare to electricity access in France?
4. Which year had the worst average school electricity access percentage?

## Sources
<li><a href="https://www.kaggle.com/datasets/muhammadaammartufail/global-school-electricity-access">Global School Electricity Access Data (2000-2020) by Muhammad Aammar Tufail</a></li>

## Method Algorithms

### main()
1. Output a dashed line: "---------------------"
2. Output the name of the first analysis function
3. Call the first function
4. Repeat these steps with the other analysis functions

### CSVtoNestedList()
1. Create a file object using the CSV path
1. Try to read each line, print an error notification if something goes wrong
1. For each line in the dataset
    1. Add each line into its own list
    1. Add the line list into the list of lists
1. Return the list of lists

### CountryWorstAccess()
1. For each inner list in the list of lists
    1. Set index 0 and index 3 of the inner list as a key-value pair of a dictionary
1. Turn all the values into a list
1. Find the minimum of this list
1. Use the lowest access value to call the key (country)
1. Output the results

### AccessCoteDivoire()
1. 

### CoteDivoireFrance()
1. 

### YearWorstAccess()
1. 
