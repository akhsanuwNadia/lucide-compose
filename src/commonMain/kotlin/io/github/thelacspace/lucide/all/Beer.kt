package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Beer") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.0,11.0)
                lineTo(18.0,11.0)
                curveTo(19.6516170501709,11.007386207580566,20.986614227294922,12.348365783691406,20.986614227294922,14.0)
                curveTo(20.986614227294922,15.651634216308594,19.6516170501709,16.992612838745117,18.0,17.0)
                lineTo(17.0,17.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,12.0)
                lineTo(9.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,12.0)
                lineTo(13.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,7.5)
                curveTo(13.0,7.5,12.559999465942383,8.0,11.0,8.0)
                curveTo(9.440000534057617,8.0,9.0,7.5,8.0,7.5)
                curveTo(7.0,7.5,6.279999732971191,8.0,5.5,8.0)
                curveTo(4.123652458190918,7.993844985961914,3.011155366897583,6.87636137008667,3.011155366897583,5.5)
                curveTo(3.011155366897583,4.12363862991333,4.123652458190918,3.006155252456665,5.5,3.0)
                curveTo(6.279999732971191,3.0,7.070000171661377,3.5,8.0,3.5)
                curveTo(8.930000305175781,3.5,9.4399995803833,2.0,11.0,2.0)
                curveTo(12.5600004196167,2.0,13.0,3.5,14.0,3.5)
                curveTo(15.0,3.5,15.720000267028809,3.0,16.5,3.0)
                curveTo(17.8763484954834,3.006155252456665,18.98884391784668,4.12363862991333,18.98884391784668,5.5)
                curveTo(18.98884391784668,6.87636137008667,17.8763484954834,7.993844985961914,16.5,8.0)
                curveTo(15.720000267028809,8.0,15.0,7.5,14.0,7.5)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0,8.0)
                lineTo(5.0,20.0)
                curveTo(5.0,21.104570388793945,5.895430564880371,22.0,7.0,22.0)
                lineTo(15.0,22.0)
                curveTo(16.104570388793945,22.0,17.0,21.104570388793945,17.0,20.0)
                lineTo(17.0,8.0)
            }
}

public val LucideIcons.All.BeerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Beer: ImageVector
    @Composable get() = BeerDefinition.asImageVector()
