package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TrianglesCenterlineDashedHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0,12.0)
                lineTo(8.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,12.0)
                lineTo(14.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,12.0)
                lineTo(20.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,12.0)
                lineTo(2.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.297999858856201,20.288000106811523)
                curveTo(7.009145736694336,20.5728702545166,6.921026229858398,21.0040283203125,7.074942588806152,21.379390716552734)
                curveTo(7.228858947753906,21.75475311279297,7.594306468963623,21.999927520751953,8.0,22.0)
                lineTo(16.0,22.0)
                curveTo(16.40587615966797,22.00033187866211,16.77169418334961,21.755306243896484,16.925867080688477,21.379852294921875)
                curveTo(17.080039978027344,21.004398345947266,16.99198341369629,20.572998046875,16.702999114990234,20.288000106811523)
                lineTo(12.71199893951416,16.29800033569336)
                curveTo(12.524212837219238,16.10732078552246,12.267831802368164,15.99986743927002,12.000207901000977,15.999680519104004)
                curveTo(11.732583999633789,15.999492645263672,11.476052284240723,16.106584548950195,11.287999153137207,16.297000885009766)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.297999858856201,3.7119998931884766)
                curveTo(7.009145736694336,3.4271299839019775,6.921026229858398,2.9959723949432373,7.074942588806152,2.6206095218658447)
                curveTo(7.228858947753906,2.2452468872070312,7.594306468963623,2.000072717666626,8.0,2.0)
                lineTo(16.0,2.0)
                curveTo(16.40587615966797,1.9996672868728638,16.77169418334961,2.2446930408477783,16.925867080688477,2.620147228240967)
                curveTo(17.080039978027344,2.9956014156341553,16.99198341369629,3.427002429962158,16.702999114990234,3.7119998931884766)
                lineTo(12.71199893951416,7.701999664306641)
                curveTo(12.524212837219238,7.892679691314697,12.267831802368164,8.00013256072998,12.000207901000977,8.000320434570312)
                curveTo(11.732584953308105,8.000508308410645,11.476052284240723,7.893415451049805,11.287999153137207,7.702999591827393)
                close()
            }
}

public val LucideIcons.All.TrianglesCenterlineDashedHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TrianglesCenterlineDashedHorizontal: ImageVector
    @Composable get() = TrianglesCenterlineDashedHorizontalDefinition.asImageVector()
