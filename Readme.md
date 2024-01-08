## Design Patterns IN Java

The structure of implementing DP will follow as

- Overview of specific DP
- Concepts
- Design
- Example
- Pitfalls
- Contrast
- Summary


### Creational DP

- Singleton
- Builder
- Prototype
- Factory
- AbstractFactory


1) Singleton

- Concepts
    - only one instance is created
    - It guarantees control of a resource
    - Lazily loaded
    - Example: Runtime, Logger( sometimes structural), Spring-Beans, Graphic Managers
- Design
    - Class is responsible for lifecycle
    - Static in nature: not implemented using static class, reason it needs to be thread safe
    - Needs to be thread safe
    - Private instance
    - Private constructor
    - No parameters required for construction
- Example:
  - ```
    Runtime singletonRuntime = Runtime.getRuntime();
    singletonRuntime.gc();
    System.out.println(singletonRuntime);
    
    Runtime anotherInstance = Runtime.getRuntime();
    System.out.println(anotherInstance);
    
    if( singletonRuntime == anotherInstance){
        System.out.println("They are the same instance");
    }
    ```
    - Here both the instances are using the same object address.
    
- Pitfalls
  - Often overused-making everything singleton is not required
  - Difficult to unit test-since singleton doesn't have an interface, hence it becomes difficult for testing
  - if not careful, then it's not thread-safe
  - sometime singleton is confused with Factory (getInstance() method with parameters)
  - java.util.Calendar is not a singleton -> Prototype

- Contrast 
  - Singleton Vs Factory

  | Singleton                                               | Factory                                                 |
  |:--------------------------------------------------------:|:-------------------------------------------------------:|
  | Returns same instance - 1 constructor method with no args | Returns various instances - Multiple Constructors       |
  | No Interface                                            | Interface driver                                        |
  | Difficult                                               | Adaptable to environment more easily                    |

- Summary
  - Guarantee one instances
  - Easy to implement
  - Thread safe
  - Solves a well-defined problem
  - Don't confuse with Factory