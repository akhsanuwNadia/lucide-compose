package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Package") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0,21.729999542236328)
                curveTo(11.618802070617676,22.087265014648438,12.381197929382324,22.087265014648438,13.0,21.729999542236328)
                lineTo(20.0,17.729999542236328)
                curveTo(20.618167877197266,17.37310028076172,20.999267578125,16.71379852294922,21.0,16.0)
                lineTo(21.0,8.0)
                curveTo(20.999267578125,7.286201477050781,20.618167877197266,6.626898765563965,20.0,6.269999980926514)
                lineTo(13.0,2.2699999809265137)
                curveTo(12.381197929382324,1.9127343893051147,11.618802070617676,1.9127343893051147,11.0,2.2699999809265137)
                lineTo(4.0,6.269999980926514)
                curveTo(3.3818318843841553,6.626898765563965,3.000732183456421,7.286201477050781,3.0,8.0)
                lineTo(3.0,16.0)
                curveTo(3.000732421875,16.71379852294922,3.3818321228027344,17.37310028076172,4.0,17.729999542236328)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,22.0)
                lineTo(12.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.2899999618530273,7.0)
                lineTo(12.0,12.0)
                lineTo(20.709999084472656,7.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.5,4.269999980926514)
                lineTo(16.5,9.420000076293945)
            }
}

public val LucideIcons.All.PackageDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Package: ImageVector
    @Composable get() = PackageDefinition.asImageVector()
