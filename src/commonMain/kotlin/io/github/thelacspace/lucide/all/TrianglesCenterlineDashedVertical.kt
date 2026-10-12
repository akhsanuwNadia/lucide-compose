package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedVertical") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,14.0)
                lineTo(12.0,16.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,20.0)
                lineTo(12.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,2.0)
                lineTo(12.0,4.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,8.0)
                lineTo(12.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.288000106811523,16.702999114990234)
                curveTo(20.572998046875,16.99198341369629,21.004398345947266,17.080039978027344,21.379852294921875,16.925867080688477)
                curveTo(21.755306243896484,16.77169418334961,22.00033187866211,16.40587615966797,22.0,16.0)
                lineTo(22.0,8.0)
                curveTo(22.000333786010742,7.5941243171691895,21.755308151245117,7.228305339813232,21.379852294921875,7.074132442474365)
                curveTo(21.004398345947266,6.91995906829834,20.572998046875,7.008016109466553,20.288000106811523,7.296999931335449)
                lineTo(16.29800033569336,11.288000106811523)
                curveTo(16.10732078552246,11.475786209106445,15.99986743927002,11.73216724395752,15.999680519104004,11.999791145324707)
                curveTo(15.999492645263672,12.267415046691895,16.106584548950195,12.523946762084961,16.297000885009766,12.711999893188477)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.7119998931884766,16.702999114990234)
                curveTo(3.427002429962158,16.99198341369629,2.9956014156341553,17.080039978027344,2.620147228240967,16.925867080688477)
                curveTo(2.2446930408477783,16.77169418334961,1.9996672868728638,16.40587615966797,2.0,16.0)
                lineTo(2.0,8.0)
                curveTo(1.9996668100357056,7.5941243171691895,2.24469256401062,7.228305339813232,2.6201467514038086,7.074132442474365)
                curveTo(2.995601177215576,6.91995906829834,3.427002191543579,7.008016109466553,3.7119998931884766,7.296999931335449)
                lineTo(7.701999664306641,11.288000106811523)
                curveTo(7.892679691314697,11.475786209106445,8.00013256072998,11.73216724395752,8.000320434570312,11.999791145324707)
                curveTo(8.000508308410645,12.267414093017578,7.893415451049805,12.523946762084961,7.702999591827393,12.711999893188477)
                close()
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedVerticalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedVertical: ImageVector
    @Composable get() = TrianglesCenterlineDashedVerticalDefinition.asImageVector()
