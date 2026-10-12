package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FolderPen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f,11.5f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(7.9f,3.0f)
                curveTo(8.6f,3.0f,9.2f,3.3f,9.6f,3.9f)
                lineTo(10.400001f,5.1000004f)
                curveTo(10.8f,5.7000003f,11.400001f,6.0000005f,12.1f,6.0000005f)
                lineTo(20.0f,6.0000005f)
                curveTo(21.104568f,6.0000005f,22.0f,6.8954306f,22.0f,8.0f)
                lineTo(22.0f,18.0f)
                curveTo(22.0f,19.10457f,21.10457f,20.0f,20.0f,20.0f)
                lineTo(10.5f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(11.378f,13.626f)
                curveTo(11.91862f,13.090195f,12.13123f,12.30608f,11.935326f,11.570567f)
                curveTo(11.73942f,10.835054f,11.164947f,10.260581f,10.429434f,10.064675f)
                curveTo(9.693921f,9.868771f,8.909806f,10.081381f,8.374001f,10.622001f)
                lineTo(3.3640003f,15.634001f)
                curveTo(3.1262476f,15.871622f,2.952221f,16.165335f,2.8580003f,16.488f)
                lineTo(2.0210004f,19.358002f)
                curveTo(1.969881f,19.533266f,2.0183516f,19.72246f,2.1474464f,19.851555f)
                curveTo(2.2765412f,19.98065f,2.4657352f,20.029121f,2.6410003f,19.978003f)
                lineTo(5.511f,19.141003f)
                curveTo(5.8336654f,19.046782f,6.1273785f,18.872755f,6.3650002f,18.635002f)
                close()
            }
}

public val LucideIcons.All.FolderPenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FolderPen: ImageVector
    @Composable get() = FolderPenDefinition.asImageVector()
