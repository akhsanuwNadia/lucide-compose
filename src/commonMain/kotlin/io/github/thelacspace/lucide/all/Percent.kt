package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Percent") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(19.0f,5.0f)
                lineTo(5.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,6.5f)
                curveTo(3.9959936f,7.3958273f,4.471613f,8.225326f,5.2467613f,8.674399f)
                curveTo(6.0219097f,9.123474f,6.9780903f,9.123474f,7.7532387f,8.674399f)
                curveTo(8.528387f,8.225326f,9.004006f,7.3958273f,9.0f,6.5f)
                curveTo(9.004006f,5.6041727f,8.528387f,4.7746744f,7.7532387f,4.3256f)
                curveTo(6.9780903f,3.876526f,6.0219097f,3.876526f,5.2467613f,4.3256f)
                curveTo(4.471613f,4.7746744f,3.9959936f,5.6041727f,4.0f,6.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,17.5f)
                curveTo(14.995994f,18.395828f,15.471613f,19.225325f,16.246761f,19.6744f)
                curveTo(17.02191f,20.123474f,17.97809f,20.123474f,18.753239f,19.6744f)
                curveTo(19.528387f,19.225325f,20.004005f,18.395828f,20.0f,17.5f)
                curveTo(20.004005f,16.604172f,19.528387f,15.774674f,18.753239f,15.325601f)
                curveTo(17.97809f,14.876526f,17.02191f,14.876526f,16.246761f,15.325601f)
                curveTo(15.471613f,15.774674f,14.995994f,16.604172f,15.0f,17.5f)
            }
}

public val LucideIcons.All.PercentDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Percent: ImageVector
    @Composable get() = PercentDefinition.asImageVector()
