package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PlaneTakeoff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,22.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.36f,17.4f)
                lineTo(4.0f,17.0f)
                lineTo(2.0f,13.0f)
                lineTo(3.1f,12.45f)
                curveTo(3.666095f,12.164742f,4.3339047f,12.164742f,4.8999996f,12.45f)
                lineTo(5.0699997f,12.55f)
                curveTo(5.636095f,12.835258f,6.3039045f,12.835258f,6.87f,12.55f)
                lineTo(8.0f,12.0f)
                lineTo(5.0f,6.0f)
                lineTo(5.9f,5.55f)
                curveTo(6.5784626f,5.216237f,7.3871484f,5.2936234f,7.99f,5.75f)
                lineTo(12.01f,8.75f)
                curveTo(12.615076f,9.210422f,13.428891f,9.287928f,14.110001f,8.95f)
                lineTo(18.300001f,6.89f)
                curveTo(18.83544f,6.62009f,19.452267f,6.559477f,20.03f,6.72f)
                lineTo(21.0f,7.0f)
                curveTo(21.405872f,7.1127124f,21.739422f,7.4021826f,21.908157f,7.7881417f)
                curveTo(22.076895f,8.174101f,22.06288f,8.615521f,21.87f,8.99f)
                lineTo(21.490002f,9.75f)
                curveTo(21.260002f,10.21f,20.890001f,10.59f,20.420002f,10.83f)
                lineTo(7.58f,17.2f)
                curveTo(7.202445f,17.387009f,6.7754745f,17.450005f,6.3599997f,17.380001f)
                close()
            }
}

public val LucideIcons.All.PlaneTakeoffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PlaneTakeoff: ImageVector
    @Composable get() = PlaneTakeoffDefinition.asImageVector()
