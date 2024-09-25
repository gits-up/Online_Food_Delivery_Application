# HACKTOBERFEST 2024

This is an online food delivery system with stripe payment and cloudinary ( for admin panel photo upload ), you can update the functionality of buttons and other things in frontend because it is not fully functional yet :( DONOT CHANGE THE CORE DESIGN OF FRONTEND also the frontend is hosted on vercel you can see but the backend is deployed in railway.app but the domain generated link is not working even though a Dockerfile is added and MySQL variables are provided there. The stripe payment is working but after payment success there is whitelabel error so you can look into that too. Happy Contributing and good luck to all for hacktoberfest :)




# Online_Food_Delivery_Application


### Technology (mern)

- React
- node js
- express js
- role base access (ROLE_CUSTOMER, ROLE_RESTAURANT_OWNER)
- nodemailer
- json web token
- mySQL(Database)
- Tailwind css
- Mui (css component library)
- Redux (State managment library)
- Axios
- stripe payment gateway

### Tools

- vs code (react)

- Model
    - User
        
        # User Entity
        
        ```jsx
        
        	Long id;
        	fullName;
        	email;
        	password;
        	role;
        	orders;
        	favorites
        	addresses 
        	status;
        ```
        
    - Restaurant
        
        ```jsx
        public class Restaurant {
            id;
            owner;
            name;
            description;
            cuisineType;
            address;
            contactInformation;
            openingHours;
            reviews;
            orders;
            numRating;
            images;
            registrationDate;
            open;
            foods;
        }
        ```
        
    - Food
        
        ```jsx
        public class Food {
            id;
            name;
            description;
            price;
            foodCategory;
            images;
            available;
            restaurant;
            isVegetarian;
            isSeasonal;
            ingredients;
            creationDate;
        }
        ```
        
    - Food Category
        
        ```jsx
        public class Category {
            id;
            name;
            restaurant;
        }
        ```
        
    - Ingredients
        
        ```jsx
        public class IngredientCategory {
            id;
            name;
            restaurant;
            ingredients;
        }
        ```
        
        ```jsx
        public class IngredientsItem {
            id;
            name;
            category;
            restaurant;
            inStock;
        }
        ```
        
    - Event
        
        ```jsx
        public class Events {
            id;
            image;
            startedAt;
            endsAt;
            name;
            restaurant;
            location;
        }
        ```
        
    - Order
        
        ```jsx
        public class Order {
            id;
            customer;
            restaurant;
            totalAmount;
            orderStatus;
            createdAt;
            deliveryAddress;
            items;
            payment;
            totalItem;
            totalPrice;
        }
        ```
        
    - order item
        
        ```jsx
        public class OrderItem {
            id;
            food;
            quantity;
            totalPrice;
            ingredients;
        }
        ```
        
    - Cart
        
        ```jsx
        public class Cart {
            id;
            customer;
            items;
            total;
        }
        ```
        
    - Cart Item
        
        ```jsx
        public class CartItem {
            id;
            cart;
            food;
            quantity;
            ingredients;
            totalPrice;
        }
        ```
     ### Technology
    
    - React
    - Spring boot
    - spring security
    - role base access (ROLE_CUSTOMER, ROLE_RESTAURANT_OWNER)
    - spring start mail
    - json web token
    - Mysql(Database)
    - Tailwind css
    - Mui (css component library)
    - Redux (State managment library)
    - Axios
    - stripe payment gateway
    
    ### Tools
    
    - intellij idea (spring boot)
    - vs code (react)
