package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PackageMinus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,17.0)
                lineTo(22.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0,13.0)
                lineTo(21.0,8.0)
                curveTo(20.999267578125,7.286201477050781,20.618167877197266,6.626898765563965,20.0,6.269999980926514)
                lineTo(13.0,2.2699999809265137)
                curveTo(12.381197929382324,1.9127343893051147,11.618802070617676,1.9127343893051147,11.0,2.2699999809265137)
                lineTo(4.0,6.269999980926514)
                curveTo(3.3818318843841553,6.626898765563965,3.000732183456421,7.286201477050781,3.0,8.0)
                lineTo(3.0,16.0)
                curveTo(3.0010886192321777,16.713441848754883,3.382140636444092,17.37228012084961,4.0,17.729000091552734)
                lineTo(11.0,21.729000091552734)
                curveTo(11.618623733520508,22.08657455444336,12.381019592285156,22.086956024169922,13.0,21.729999542236328)
                lineTo(14.675000190734863,20.774999618530273)
            }
            lucidePath(strokeWidth) {
                moveTo(3.2899999618530273,7.0)
                lineTo(12.0,12.0)
                lineTo(20.709999084472656,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,4.269999980926514)
                lineTo(16.496999740600586,9.417999267578125)
            }
}

public val LucideIcons.All.PackageMinusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PackageMinus: ImageVector
    @Composable get() = PackageMinusDefinition.asImageVector()
