package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Bubbles") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7.001f,15.085f)
                curveTo(7.460113f,14.923044f,7.9692707f,14.993978f,8.366635f,15.275253f)
                curveTo(8.764f,15.556529f,9.00014f,16.013159f,9.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,8.5f)
                curveTo(14.994391f,9.754158f,15.660258f,10.915456f,16.745466f,11.54416f)
                curveTo(17.830673f,12.172863f,19.169327f,12.172863f,20.254534f,11.54416f)
                curveTo(21.339743f,10.915456f,22.00561f,9.754158f,22.0f,8.5f)
                curveTo(22.00561f,7.2458415f,21.339743f,6.084544f,20.254534f,5.4558406f)
                curveTo(19.169327f,4.8271365f,17.830673f,4.8271365f,16.745466f,5.4558406f)
                curveTo(15.660258f,6.084544f,14.994391f,7.2458415f,15.0f,8.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,16.5f)
                curveTo(1.9911863f,18.47082f,3.0375485f,20.295715f,4.742875f,21.28368f)
                curveTo(6.4482017f,22.271643f,8.551798f,22.271643f,10.257125f,21.28368f)
                curveTo(11.962452f,20.295715f,13.008814f,18.47082f,13.0f,16.5f)
                curveTo(13.008814f,14.52918f,11.962452f,12.704284f,10.257125f,11.716321f)
                curveTo(8.551798f,10.728357f,6.4482017f,10.728357f,4.742875f,11.716321f)
                curveTo(3.0375485f,12.704284f,1.9911863f,14.52918f,2.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,4.5f)
                curveTo(4.9959936f,5.3958273f,5.471613f,6.2253256f,6.2467613f,6.6744f)
                curveTo(7.0219097f,7.123474f,7.9780903f,7.123474f,8.753239f,6.6744f)
                curveTo(9.528387f,6.2253256f,10.004006f,5.3958273f,10.0f,4.5f)
                curveTo(10.004006f,3.6041727f,9.528387f,2.7746744f,8.753239f,2.3256004f)
                curveTo(7.9780903f,1.8765261f,7.0219097f,1.8765261f,6.2467613f,2.3256004f)
                curveTo(5.471613f,2.7746744f,4.9959936f,3.6041727f,5.0f,4.5f)
            }
}

public val LucideIcons.All.BubblesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Bubbles: ImageVector
    @Composable get() = BubblesDefinition.asImageVector()
