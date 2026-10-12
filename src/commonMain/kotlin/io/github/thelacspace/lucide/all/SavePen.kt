package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SavePen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.33f,13.0f)
                lineTo(8.0f,13.0f)
                curveTo(7.4477153f,13.0f,7.0f,13.447715f,7.0f,14.0f)
                lineTo(7.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.363f,17.634f)
                curveTo(14.125247f,17.871622f,13.9512205f,18.165335f,13.857f,18.488f)
                lineTo(13.02f,21.358002f)
                curveTo(12.968882f,21.533266f,13.017352f,21.72246f,13.146446f,21.851555f)
                curveTo(13.275541f,21.98065f,13.464735f,22.029121f,13.64f,21.978003f)
                lineTo(16.51f,21.141003f)
                curveTo(16.832666f,21.046782f,17.126379f,20.872755f,17.364f,20.635002f)
                lineTo(21.377f,16.626003f)
                curveTo(21.917622f,16.090197f,22.130232f,15.306083f,21.934326f,14.57057f)
                curveTo(21.73842f,13.835057f,21.163948f,13.260584f,20.428434f,13.064678f)
                curveTo(19.69292f,12.868773f,18.908808f,13.081384f,18.373001f,13.622004f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,3.0f)
                lineTo(7.0f,7.0f)
                curveTo(7.0f,7.5522847f,7.4477153f,8.0f,8.0f,8.0f)
                lineTo(15.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(5.0f,21.0f)
                curveTo(3.8954306f,21.0f,3.0f,20.10457f,3.0f,19.0f)
                lineTo(3.0f,5.0f)
                curveTo(3.0f,3.8954306f,3.8954306f,3.0f,5.0f,3.0f)
                lineTo(15.2f,3.0f)
                curveTo(15.727538f,3.007514f,16.23074f,3.2231712f,16.6f,3.6f)
                lineTo(20.4f,7.3999996f)
                curveTo(20.776829f,7.7692604f,20.992485f,8.272461f,21.0f,8.799999f)
                lineTo(21.0f,9.099999f)
            }
}

public val LucideIcons.All.SavePenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SavePen: ImageVector
    @Composable get() = SavePenDefinition.asImageVector()
