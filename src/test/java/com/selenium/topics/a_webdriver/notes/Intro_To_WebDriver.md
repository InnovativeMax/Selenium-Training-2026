# WebDriver

## What is Selenium?

Selenium is an open-source framework used to automate web applications.

## What is WebDriver?

`WebDriver` is an **interface** in Selenium used to control and interact with web browsers.

```java
WebDriver driver = new ChromeDriver();
```

* `WebDriver` → Interface
* `ChromeDriver` → Class
* `driver` → Reference variable

---

## Common WebDriver Methods

| Method               | Purpose                                     |
| -------------------- | ------------------------------------------- |
| `get()`              | Opens a URL                                 |
| `getTitle()`         | Returns page title                          |
| `getCurrentUrl()`    | Returns current URL                         |
| `getPageSource()`    | Returns page source                         |
| `findElement()`      | Finds first matching element                |
| `findElements()`     | Finds all matching elements                 |
| `getWindowHandle()`  | Returns current window handle               |
| `getWindowHandles()` | Returns all window handles                  |
| `close()`            | Closes current window/tab                   |
| `quit()`             | Closes all windows and ends session         |
| `navigate()`         | Performs browser navigation                 |
| `switchTo()`         | Switches between windows, frames and alerts |
| `manage()`           | Manages cookies, timeouts and window        |

---

## Important Methods

### `get()`

```java
driver.get("https://www.google.com");
```

Opens the specified URL.

### `getTitle()`

```java
driver.getTitle();
```

Returns the title of the current page.

### `getCurrentUrl()`

```java
driver.getCurrentUrl();
```

Returns the current URL.

### `close()` vs `quit()`

```java
driver.close();
driver.quit();
```

**`close()`** → closes the current browser window/tab.

**`quit()`** → closes all browser windows and terminates the WebDriver session.

---

## `navigate()`

Used for browser navigation.

```java
driver.navigate().to("https://google.com");
driver.navigate().back();
driver.navigate().forward();
driver.navigate().refresh();
```

---

## `switchTo()`

Used to switch between different browser contexts.

```java
driver.switchTo().window(windowHandle);

driver.switchTo().frame(0);

driver.switchTo().defaultContent();

driver.switchTo().alert();
```

Commonly used for:

* Windows/Tabs
* Frames/Iframes
* Alerts

---

## `manage()`

Used to manage browser settings.

```java
driver.manage().window().maximize();

driver.manage().deleteAllCookies();
```

Also provides:

* Cookies
* Timeouts
* Window management

---

# Interview Questions

### 1. What is WebDriver?

WebDriver is an interface in Selenium used to control web browsers.

### 2. Why do we write:

```java
WebDriver driver = new ChromeDriver();
```

Because `WebDriver` is an interface and `ChromeDriver` is a class that implements it.

### 3. Difference between `close()` and `quit()`?

`close()` closes the current window, whereas `quit()` closes all windows and terminates the WebDriver session.

### 4. Difference between `get()` and `navigate().to()`?

Both can navigate to a URL. `navigate()` additionally provides `back()`, `forward()`, and `refresh()` operations.

### 5. Difference between `findElement()` and `findElements()`?

`findElement()` returns the first matching `WebElement`.

`findElements()` returns a list of all matching elements. If nothing is found, it returns an empty list.

---
