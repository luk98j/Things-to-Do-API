# Service

## FoodPostService

### getPosts
1. Check database for location 
2. Load post from database 
3. If not any post will be from database or small amount then load from google near restaurants opinios

### savePost
1. Check photo of user - if this is a food picture or some different
2. Check user opinion. If don't have links or different opinion then about restaurant and food
3. Save user opinion in database
4. Lock posiblity for user to add another post in near time