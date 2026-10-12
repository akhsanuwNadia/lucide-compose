package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FileChartPie") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.941f,22.0f)
                lineTo(18.0f,22.0f)
                curveTo(19.10457f,22.0f,20.0f,21.10457f,20.0f,20.0f)
                lineTo(20.0f,8.0f)
                curveTo(20.001036f,7.360635f,19.746914f,6.747285f,19.294f,6.296f)
                lineTo(15.706f,2.708f)
                curveTo(15.254556f,2.25386f,14.640347f,1.9989595f,14.0f,2.0f)
                lineTo(6.0f,2.0f)
                curveTo(4.8954306f,2.0f,4.0f,2.8954306f,4.0f,4.0f)
                lineTo(4.0f,7.512f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,2.0f)
                lineTo(14.0f,7.0f)
                curveTo(14.0f,7.5522847f,14.447715f,8.0f,15.0f,8.0f)
                lineTo(20.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.017f,11.512f)
                curveTo(2.3504417f,12.990976f,1.6407202f,15.271688f,2.1738064f,17.43516f)
                curveTo(2.7068927f,19.59863f,4.394982f,21.288515f,6.557885f,21.823898f)
                curveTo(8.720789f,22.359283f,11.002254f,21.651985f,12.483f,19.987f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,16.0f)
                curveTo(8.447715f,16.0f,8.0f,15.552285f,8.0f,15.0f)
                lineTo(8.0f,11.0f)
                curveTo(8.0f,10.448f,8.45f,9.992f,8.995f,10.083f)
                curveTo(11.516952f,10.507067f,13.492933f,12.483048f,13.917f,15.005f)
                curveTo(14.007999f,15.549f,13.552f,16.0f,13.0f,16.0f)
                close()
            }
}

public val LucideIcons.All.FileChartPieDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FileChartPie: ImageVector
    @Composable get() = FileChartPieDefinition.asImageVector()
