package org.specs2.specification

import org.specs2.Specification

class BaseSpecificationSpec extends Specification {
   val spec: Examples = 
"""A basic specification is just some pieces of text interleaved with some examples
   This is an example of such a specification:
   
     object ReverseSpec extends Specification { 
       val spec = 
       "A reverse function can reverse a string"^
       "if the string is empty, it return an empty string" ~ e1
       "if the string is not empty, it returns the reversed string" ~ e2
       def e1 = reverse("") must_== ""
       def e2 = reverse("abc") must_== "bca"
    
   When execute on the Console, the expected output is: 
   > Specification Reverse
   > A reverse function can reverse a string
   >   + if the string is empty, it return an empty string
   >   + if the string is not empty, it returns the reversed string
    
  The following examples are going to specify the basic components for such a specification:
    * building the list of examples, with text and executable code
    * parsing the text so that it can be rendered as a tree
    * executing the tree to collect results
    * printing out results to the Console
""" ^
  "building the list of examples, with text and executable code" ^
  include(new ExamplesSpec())
    
  
}