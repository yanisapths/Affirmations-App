# Affirmations-App

## Adding a recyclerView 

#### item
   One data item of the list to display. Represents one Affirmation object.
#### Adapter
   Takes data and prepares it for RecyclerView to display.
#### ViewHolders
   A pool of views for RecyclerView to use and reuse to display affirmations.
#### RecyclerView 
   Views on screen
      
   ![image](https://user-images.githubusercontent.com/72002605/177455191-6576878e-4539-423b-b046-59ca34fb7a9e.png)

## Add a RecyclerView to the layout 
  Since this app will has only one single child view --> RecyclerView, switch to ViewGroup called "FrameLayout" 
  that should be used for holding a single child view.
  
 ![image](https://user-images.githubusercontent.com/72002605/177455704-8600446e-12d7-42e2-af10-895b289a240d.png)
 
 
 ## Summary 
 
 #### RecyclerView
   - Helps display a list of data
   - Use the adapter pattern to adapt and display the data.
   - Comes with built in 'LayoutManager' , 'RecyclerView' delegates how items are laid out to LayoutManagers.
 #### ViewHolder
   - Creates and holds the view for RecyclerView
   
 ## To implement the adapter
   - Create a new class for adpter, ex. _ItemAdapter_
   - Create a custom _ViewHolder_ class (represent a single ist item view) extend from _ReyclerView.viewHoder_ class.
   - Modify _ItemAdapter_ class to extend from the _RecyclerView.Adapter_ class with the custom ViewHolder class.
   - Implement methods within the adapter ( _getItemsCount() , onCreateViewHolder(), and onBindViewHolder()_ )
   ![image](https://user-images.githubusercontent.com/72002605/177662228-06ca2f93-e911-446e-86d3-908022a8cea2.png)

## Adding images to the list item
![image](https://user-images.githubusercontent.com/72002605/177665175-0a88ae0e-831b-438b-924c-4986b1651508.png)

   
