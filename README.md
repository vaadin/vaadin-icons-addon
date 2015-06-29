# Vaadin Icons Add-on for Vaadin 7

Vaadin Icons Add-on enables easy usage of [Vaadin Icons](https://vaadin.com/font-icons) in your Vaadin application.

## Download release

Official releases of this add-on are available at Vaadin Directory. For Maven instructions, download and reviews, go to http://vaadin.com/addon/vaadin-icons

## Usage

* Add the add-on to your Vaadin project.
* Download the font files from [https://vaadin.com/font-icons/download](https://vaadin.com/font-icons/download).
* Copy the font files under `fonts` subdirectory in your theme.
* Add following lines to your theme.
```
/* This font-face declaration must be outside your theme mixin. */
@font-face {
    font-family: 'Vaadin-Icons';
    src: url('fonts/Vaadin-Icons.eot');
    src: url('fonts/Vaadin-Icons.eot?#iefix') format('embedded-opentype'),
         url('fonts/Vaadin-Icons.woff') format('woff'),
         url('fonts/Vaadin-Icons.ttf') format('truetype'),
         url('fonts/Vaadin-Icons.svg#icomoon') format('svg');
}
.Vaadin-Icons {
	font-family: 'Vaadin-Icons';
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
