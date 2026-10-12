package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Panda") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.25,17.25)
                lineTo(12.75,17.25)
                lineTo(12.0,18.0)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,12.0)
                lineTo(17.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.902000427246094,6.598999977111816)
                curveTo(17.74278450012207,6.425045490264893,17.57595443725586,6.25821590423584,17.402000427246094,6.098999977111816)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,14.5)
                curveTo(2.0,19.469999313354492,6.480000019073486,22.0,12.0,22.0)
                curveTo(17.520000457763672,22.0,22.0,19.469999313354492,22.0,14.5)
                curveTo(21.982816696166992,12.80587100982666,21.535490036010742,11.143880844116211,20.700000762939453,9.670000076293945)
                curveTo(21.912675857543945,8.435500144958496,22.310028076171875,6.614984512329102,21.72202491760254,4.987463474273682)
                curveTo(21.134023666381836,3.3599424362182617,19.66484832763672,2.213778257369995,17.943172454833984,2.039422035217285)
                curveTo(16.221494674682617,1.8650658130645752,14.552359580993652,2.6934096813201904,13.65000057220459,4.170000076293945)
                curveTo(12.561954498291016,3.940659523010254,11.4380464553833,3.940659523010254,10.350000381469727,4.170000076293945)
                curveTo(9.4534912109375,2.6804096698760986,7.779109954833984,1.8405035734176636,6.049079895019531,2.012564182281494)
                curveTo(4.319049835205078,2.1846249103546143,2.8428986072540283,3.3378684520721436,2.2573442459106445,4.974857807159424)
                curveTo(1.6717898845672607,6.611847400665283,2.081596851348877,8.439702033996582,3.310000419616699,9.670000076293945)
                curveTo(2.471017837524414,11.142946243286133,2.020235300064087,12.804991722106934,2.0,14.5)
            }
            lucidePath(strokeWidth) {
                moveTo(6.098999977111816,6.598999977111816)
                curveTo(6.25821590423584,6.425045490264893,6.425045490264893,6.25821590423584,6.598999977111816,6.098999977111816)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(7.0,14.0)
            }
}

public val LucideIcons.All.PandaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Panda: ImageVector
    @Composable get() = PandaDefinition.asImageVector()
