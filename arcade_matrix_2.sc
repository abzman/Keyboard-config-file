# Matrix setup for Arcade Controls

led caps -PF7
led scroll -PF6
led num -PF5

matrix
	scanrate 1
	debounce 5
	blocking 0

	sense			PD1		PD0		PD4		PC6		PD7		PE6	PB4	PB5
	strobe	PB6		UP		DOWN		LEFT		RIGHT		1		LCTRL	LALT	SPACE
	strobe	PB2		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	LSHIFT	Z	X
	strobe	PB3		R		F		D		G		2		A	S	Q
	strobe	PB1		UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	UNASSIGNED	W	I	K

end