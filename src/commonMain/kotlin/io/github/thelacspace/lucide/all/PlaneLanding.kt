package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneLanding") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.77f,10.77f)
                lineTo(2.0f,9.0f)
                lineTo(4.0f,4.5f)
                lineTo(5.1f,5.05f)
                curveTo(5.65f,5.3300004f,6.0f,5.8900003f,6.0f,6.5f)
                curveTo(6.0f,7.1099997f,6.35f,7.67f,6.9f,7.95f)
                lineTo(8.0f,8.5f)
                lineTo(11.0f,2.5f)
                lineTo(12.05f,3.03f)
                curveTo(12.642467f,3.3250885f,13.050568f,3.8941836f,13.14f,4.55f)
                lineTo(13.860001f,9.950001f)
                curveTo(13.949433f,10.605818f,14.357534f,11.174912f,14.950001f,11.470001f)
                lineTo(19.35f,13.670001f)
                curveTo(19.77f,13.890001f,20.130001f,14.220001f,20.36f,14.630001f)
                lineTo(20.960001f,15.660001f)
                curveTo(21.45f,16.54f,20.900002f,17.640001f,19.900002f,17.76f)
                lineTo(18.720001f,17.91f)
                curveTo(18.250002f,17.97f,17.77f,17.89f,17.35f,17.67f)
                lineTo(4.29f,11.15f)
                curveTo(4.097276f,11.052257f,3.9216661f,10.923926f,3.77f,10.7699995f)
                close()
            }
}

public val LucideIcons.All.PlaneLandingDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneLanding: ImageVector
    @Composable get() = PlaneLandingDefinition.asImageVector()
