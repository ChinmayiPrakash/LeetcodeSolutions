<h2><a href="https://leetcode.com/problems/valid-parentheses">20. Valid Parentheses</a></h2><h3>Easy</h3><hr><p>Given a string <code>s</code> containing just the characters <code>&#39;(&#39;</code>, <code>&#39;)&#39;</code>, <code>&#39;{&#39;</code>, <code>&#39;}&#39;</code>, <code>&#39;[&#39;</code> and <code>&#39;]&#39;</code>, determine if the input string is valid.</p>

<p>An input string is valid if:</p>

<ol>
	<li>Open brackets must be closed by the same type of brackets.</li>
	<li>Open brackets must be closed in the correct order.</li>
	<li>Every close bracket has a corresponding open bracket of the same type.</li>
</ol>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;()[]{}&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;(]&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">false</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">s = &quot;([])&quot;</span></p>

<p><strong>Output:</strong> <span class="example-io">true</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= s.length &lt;= 10<sup>4</sup></code></li>
	<li><code>s</code> consists of parentheses only <code>&#39;()[]{}&#39;</code>.</li>
</ul>


**Solution**
  - **Initialize a stack** to keep track of opening brackets.
- **If the string has an odd length**, return `false` (since an odd number of characters can't have all valid pairs).
- **For each character** in the string:
  - If the character is an **opening bracket** (`'('`, `'{'`, `'['`):
    - Push the opening bracket onto the stack.
  - If the character is a **closing bracket** (`')'`, `'}'`, `']'`):
    - If the stack is empty, return `false` (there's no corresponding opening bracket).
    - Pop the top of the stack and check:
      - If the popped element does not match the closing bracket, return `false`.
- **After processing all characters**:
  - If the stack is empty, return `true` (all opening brackets were matched).
  - If the stack is not empty, return `false` (some opening brackets were not matched).

