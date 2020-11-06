E/iardini.error0: Invalid ID 0x00000001 - Error resource ID
=======

This is an android project replicate of an stackoverflow error. 
See the [question](https://stackoverflow.com/questions/64714292/e-myapp-invalid-id-0x00000002-error-resource-id) for a list of known issues and solution. 
=======

I am currently stuck on an error that continues to slow down the performance of my application.

The error does not cause the application to close or crash, or to write an exception to the console. The console simply reports this message:

``` E/iardini.error0: Invalid ID 0x00000001. ```

The only things that emerge from the message are:

 - It's an error, you understand from the prefix "E/"
 - The error is within my app, "iardini.error0"
 - Didn't recognize some kind of id


**How replicate the error:** I've made a [public repository][1] on github so you can just download the source code and lunch it! You will see right away that the error will show up inside the console.

[![enter image description here][2]][2]




**What does the error message depend on? How can I fix it?**

Thanks in advance!


  [1]: https://github.com/Ciardini/error03
  [2]: https://i.stack.imgur.com/ztxTD.png
