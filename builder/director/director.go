package director

import (
	"github.com/felipefrmelo/builder/builders"
	"github.com/felipefrmelo/builder/houses"
)

type Director struct {
	builder builders.IBuilder
}

func NewDirector(b builders.IBuilder) *Director {
	return &Director{
		builder: b,
	}
}

func (d *Director) SetBuilder(b builders.IBuilder) {
	d.builder = b
}

func (d *Director) BuildHouse() houses.House {
	d.builder.SetDoorType()
	d.builder.SetWindowType()
	d.builder.SetNumFloor()
	return d.builder.GetHouse()
}
