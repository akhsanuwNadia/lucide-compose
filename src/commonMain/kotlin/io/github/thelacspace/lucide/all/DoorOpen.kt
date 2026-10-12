package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("DoorOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,21.0)
                lineTo(2.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,3.0)
                lineTo(7.0,3.0)
                curveTo(5.895430564880371,3.0,5.0,3.895430564880371,5.0,5.0)
                lineTo(5.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,12.0)
                lineTo(14.010000228881836,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(19.0,21.0)
                lineTo(19.0,5.0)
                curveTo(19.000286102294922,4.020645618438721,18.291337966918945,3.185145378112793,17.325000762939453,3.0260000228881836)
                lineTo(11.16200065612793,2.013000011444092)
                curveTo(10.872314453125,1.965442419052124,10.576362609863281,2.047576665878296,10.352618217468262,2.2376246452331543)
                curveTo(10.128873825073242,2.4276726245880127,9.99993896484375,2.7064359188079834,10.0,3.0)
                lineTo(10.0,21.0)
                curveTo(10.000081062316895,21.286775588989258,10.123276710510254,21.559715270996094,10.338289260864258,21.74947738647461)
                curveTo(10.553302764892578,21.939239501953125,10.839437484741211,22.02756118774414,11.12399959564209,21.992000579833984)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,21.0)
                lineTo(19.0,21.0)
            }
}

public val LucideIcons.All.DoorOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.DoorOpen: ImageVector
    @Composable get() = DoorOpenDefinition.asImageVector()
