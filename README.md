# Online_Food_Delivery_Application


### Technology (mern)

- react
- role base access (ROLE_CUSTOMER, ROLE_RESTAURANT_OWNER)
- json web token
- mySQL(Database)
- Tailwind css
- Mui (css component library)
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
