# Online_Food_Delivery_Application
# Online Food Delivery Project

### Technology (mern)

- React
- node js
- express js
- role base access (ROLE_CUSTOMER, ROLE_RESTAURANT_OWNER)
- nodemailer
- json web token
- mongoDB(Data base)
- Tailwind css
- Mui (css component library)
- Redux (State managment library)
- Axios
- strip payment gatway

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
        
    

# Folder Stucture

project_root/
│
├── src/
│   ├── controllers/        // Controllers handle request/response logic
│   │   ├── itemController.js
│   │   └── ...
│   │
│   ├── models/            // Database models/schema
│   │   ├── itemModel.js
│   │   └── ...
│   │
│   ├── routes/            // API routes
│   │   ├── itemRoutes.js
│   │   └── ...
│   │
│   ├── services/          // Business logic and data processing
│   │   ├── itemService.js
│   │   └── ...
│   │
│   └── app.js             // Entry point of the application
│
├── .env                   // Environment variables
├── package.json           // Project dependencies and metadata
└── ...

- spring boot
    
    ### Technology
    
    - React
    - Spring boot
    - spring security
    - role base access (ROLE_CUSTOMER, ROLE_RESTAURANT_OWNER)
    - spring start mail
    - jeson web token
    - Mysql(Data base)
    - Tailwind css
    - Mui (css component library)
    - Redux (State managment library)
    - Axios
    - strip payment gatway
    
    ### Tools
    
    - intellij idea (spring boot)
    - vs code (react)
