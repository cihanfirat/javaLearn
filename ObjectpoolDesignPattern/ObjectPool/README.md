It provides a pool of objects to reuse in situations where creating objects is costly. This pattern is used when resources need to be managed efficiently.

Purpose of Object Pool Pattern

Resource Management: Keeping unused objects in the pool so that they can be reused.

Performance Improvement: Reducing resource consumption for frequently created and destroyed objects.

Controlled Access: Managing the creation and destruction of objects through a centralized structure.

Working Principle

Object Pool: Tracks the currently available objects and objects in use.

Usage Process:Object Request: An object is taken from the pool. If there is no available object, a new object is created.

Object Return: After the use is complete, the object is returned to the pool.

Reuse: Objects that are returned become reusable.

Code Working Steps

Pool and Factory are Defined: The pool is defined with the maximum number of available objects and the logic for generating objects.

Connection is Obtained and Used: A connection is obtained from the pool.
An operation is performed on this connection (for example, connect() is called).

Connection is Returned: After the operation is completed, the connection is released back to the pool.

Reuse: When a new connection is requested from the pool, a previously returned connection is used, if possible.