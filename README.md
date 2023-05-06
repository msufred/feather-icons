# feather-icons
Feather Icons library for JavaFx applications based on icon designs from https://feathericons.com/.

### Latest Release
https://github.com/msufred/feather-icons/releases/download/v1.0.0/feather-icons_v1.0.0.jar

### Usage:

```java
// Buttons
Button button = new Button("Button 1");
button.setGraphic(new PlusIcon(14);

// Labels
Label label = new Label("Search");
label.setGraphic(new SearchIcon(14));
```

### Styling:
All icons has a style class called ``.feather-icon``. You can change the icon color in your CSS file by speficying the ``-fx-background-color`` property.

For example:
```css
.feather-icon {
  -fx-background-color: #e74c3c;
}
```
Each icon has their own style class. You can just change the color of specific icon. For example, the `SearchIcon` has a style class called `search-icon`.
```css
.search-icon {
  -fx-background-color: #e74c3c;
}
```
