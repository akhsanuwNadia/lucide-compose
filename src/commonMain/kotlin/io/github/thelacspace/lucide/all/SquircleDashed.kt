package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SquircleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.770000457763672,3.0429999828338623)
                curveTo(12.590801239013672,2.9815289974212646,11.409199714660645,2.9815289974212646,10.230000495910645,3.0429999828338623)
            }
            lucidePath(strokeWidth) {
                moveTo(13.770999908447266,20.95599937438965)
                curveTo(12.591534614562988,21.019704818725586,11.409500122070312,21.020038604736328,10.229999542236328,20.956998825073242)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18000030517578,17.739999771118164)
                curveTo(19.670000076293945,18.889999389648438,18.889999389648438,19.670000076293945,17.74100112915039,20.18000030517578)
            }
            lucidePath(strokeWidth) {
                moveTo(20.18000030517578,6.258999824523926)
                curveTo(19.670000076293945,5.111000061035156,18.888999938964844,4.329999923706055,17.739999771118164,3.82099986076355)
            }
            lucidePath(strokeWidth) {
                moveTo(20.957000732421875,10.229999542236328)
                curveTo(21.02033805847168,11.409149169921875,21.02033805847168,12.590849876403809,20.957000732421875,13.769999504089355)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0429999828338623,10.229999542236328)
                curveTo(2.9818272590637207,11.40954875946045,2.982161045074463,12.591485023498535,3.0439999103546143,13.770999908447266)
            }
            lucidePath(strokeWidth) {
                moveTo(6.260000228881836,20.179000854492188)
                curveTo(5.110000133514404,19.671001434326172,4.330000400543213,18.888999938964844,3.820000171661377,17.74100112915039)
            }
            lucidePath(strokeWidth) {
                moveTo(6.260000228881836,3.819999933242798)
                curveTo(5.111000061035156,4.329999923706055,4.330000400543213,5.111000061035156,3.820000171661377,6.260000228881836)
            }
}

public val LucideIcons.All.SquircleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SquircleDashed: ImageVector
    @Composable get() = SquircleDashedDefinition.asImageVector()
