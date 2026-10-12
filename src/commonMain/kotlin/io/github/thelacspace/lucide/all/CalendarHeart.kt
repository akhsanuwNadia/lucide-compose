package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CalendarHeart") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.126999855041504,21.0)
                lineTo(5.0,21.0)
                curveTo(3.895430564880371,21.0,3.0,20.104570388793945,3.0,19.0)
                lineTo(3.0,5.0)
                curveTo(3.0,3.895430564880371,3.895430564880371,3.0,5.0,3.0)
                lineTo(19.0,3.0)
                curveTo(20.104570388793945,3.0,21.0,3.895430564880371,21.0,5.0)
                lineTo(21.0,10.125)
            }
            lucidePath(strokeWidth) {
                moveTo(14.619999885559082,17.799999237060547)
                curveTo(14.046977043151855,17.20256996154785,13.848292350769043,16.338741302490234,14.102717399597168,15.550994873046875)
                curveTo(14.357142448425293,14.763249397277832,15.023579597473145,14.178834915161133,15.837803840637207,14.029458045959473)
                curveTo(16.652029037475586,13.880080223083496,17.482515335083008,14.189868927001953,18.0,14.836000442504883)
                curveTo(18.519878387451172,14.196741104125977,19.347599029541016,13.892783164978027,20.157634735107422,14.043668746948242)
                curveTo(20.967670440673828,14.19455337524414,21.630441665649414,14.776144027709961,21.885290145874023,15.559710502624512)
                curveTo(22.140138626098633,16.343278884887695,21.946298599243164,17.203474044799805,21.380001068115234,17.802000045776367)
                lineTo(18.75400161743164,20.658000946044922)
                curveTo(18.564451217651367,20.87625503540039,18.28957748413086,21.001598358154297,18.00050163269043,21.001598358154297)
                curveTo(17.71142578125,21.001598358154297,17.436552047729492,20.87625503540039,17.24700164794922,20.658000946044922)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,2.0)
                lineTo(16.0,5.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,9.0)
                lineTo(21.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,2.0)
                lineTo(8.0,5.0)
            }
}

public val LucideIcons.All.CalendarHeartDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CalendarHeart: ImageVector
    @Composable get() = CalendarHeartDefinition.asImageVector()
