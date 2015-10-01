# Vaadin Icons Add-on for Vaadin 7

Vaadin Icons Add-on enables easy usage of [Vaadin Icons](https://vaadin.com/font-icons) in your Vaadin application.

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to https://vaadin.com/addon/vaadin-icons-add-on

## Usage

* Add the add-on to your Vaadin project.
* Ensure that your theme contains addons.scss and it contains the following lines.
Updating addons.scss should happen when mvn vaadin:update-theme goal is executed.
```
@import "../../../VAADIN/addons/vaadin-icons/vaadin-icons.scss";


/* Import and include this mixin into your project theme to include the addon themes */
@mixin addons {
	@include vaadin-icons;
}
```
* Use the icons in your code as follows.
```
button.setIcon(VaadinIcons.VAADIN_V);
```


## License & Author

Add-on is distributed under Apache License 2.0. For license terms, see LICENSE.txt.

Vaadin Icons Add-on is written by Teemu Pöntelin / Vaadin Ltd

Vaadin Icons font is created by Jarmo Kemppainen / Vaadin Ltd
