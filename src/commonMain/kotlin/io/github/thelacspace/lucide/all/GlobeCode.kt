package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeCode") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.5,10.0)
                lineTo(13.0,7.5)
                lineTo(15.5,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.861000061035156,14.0)
                curveTo(15.442634582519531,17.004926681518555,14.092247009277344,19.80293083190918,12.0,22.0)
                curveTo(6.656484603881836,16.404077529907227,6.656484603881836,7.59592342376709,12.0,2.0)
                curveTo(6.672297954559326,2.00060772895813,2.2805721759796143,6.178062438964844,2.0136947631835938,11.499075889587402)
                curveTo(1.7468172311782837,16.82008934020996,5.698511123657227,21.416011810302734,10.999415397644043,21.9497013092041)
                curveTo(16.30031967163086,22.48339080810547,21.088844299316406,18.767423629760742,21.88800048828125,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(19.5,5.0)
                lineTo(22.0,7.5)
                lineTo(19.5,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(10.5,12.0)
            }
}

public val LucideIcons.All.GlobeCodeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeCode: ImageVector
    @Composable get() = GlobeCodeDefinition.asImageVector()
