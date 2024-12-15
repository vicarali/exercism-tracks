// @ts-check

export function Size(width = 80, height = 60) {
	this.width = width;
	this.height = height;
}

Size.prototype.resize = function (newWidth, newHeight) {
	this.width = newWidth;
	this.height = newHeight;
};

Size.prototype.ensureMinSize = function () {
	if (this.width < 1) this.width = 1;
	if (this.height < 1) this.height = 1;
};

export function Position(x = 0, y = 0) {
	this.x = x;
	this.y = y;
}

Position.prototype.move = function (newX, newY) {
	this.x = newX;
	this.y = newY;
};

Position.prototype.ensureMinPosition = function () {
	if (this.x < 0) this.x = 0;
	if (this.y < 0) this.y = 0;
};

export class ProgramWindow {
	constructor() {
		this.screenSize = new Size(800, 600);
		this.size = new Size();
		this.position = new Position();
	}

	resize(newSize) {
		newSize.ensureMinSize();
		this.ensureSizeNotOutOfScreenBounds(newSize);
		this.size = newSize;
	}

	ensureSizeNotOutOfScreenBounds(size) {
		if (size.width > this.screenSize.width - this.position.x) {
			size.width = this.screenSize.width - this.position.x;
		}
		if (size.height > this.screenSize.height - this.position.y) {
			size.height = this.screenSize.height - this.position.y;
		}
	}

	move(newPosition) {
		newPosition.ensureMinPosition();
		this.ensurePositionNotOutOfScreenBounds(newPosition);
		this.position = newPosition;
	}

	ensurePositionNotOutOfScreenBounds(position) {
		if (this.screenSize.width < this.size.width + position.x) {
			position.x = this.screenSize.width - this.size.width;
		}
		if (this.screenSize.height < this.size.height + position.y) {
			position.y = this.screenSize.height - this.size.height;
		}
	}
}

export function changeWindow(programWindow) {
	const newSize = new Size(400, 300);
	programWindow.resize(newSize);

	const newPosition = new Position(100, 150);
	programWindow.move(newPosition);

	return programWindow;
}