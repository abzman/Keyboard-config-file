# Matrix setup for Arcade Controls

led caps -PF7
led scroll -PF6
led num -PF5

matrix
	scanrate 1
	debounce 5
	blocking 0

	sense			PB6	PB2		PB3	PB1		
	strobe	PD1		UP	UNASSIGNED	R	UNASSIGNED
	strobe	PD0		DOWN	UNASSIGNED	F	UNASSIGNED
	strobe	PD4		LEFT	UNASSIGNED	D	UNASSIGNED
	strobe	PC6		RIGHT	UNASSIGNED	G	UNASSIGNED
	strobe	PD7		1	UNASSIGNED	2	UNASSIGNED
	strobe	PE6		LCTRL	LSHIFT		A	W
	strobe	PB4		LALT	Z		S	I
	strobe	PB5		SPACE	X		Q	K
end
