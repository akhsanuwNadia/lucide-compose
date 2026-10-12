package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Blend") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(8.0f,9.0f)
                curveTo(7.9887824f,11.508317f,9.320517f,13.830912f,11.4909315f,15.088319f)
                curveTo(13.661347f,16.345726f,16.338652f,16.345726f,18.509068f,15.088319f)
                curveTo(20.679483f,13.830912f,22.011217f,11.508317f,22.0f,9.0f)
                curveTo(22.011217f,6.4916835f,20.679483f,4.1690884f,18.509068f,2.9116807f)
                curveTo(16.338652f,1.654273f,13.661347f,1.654273f,11.4909315f,2.9116807f)
                curveTo(9.320517f,4.1690884f,7.9887824f,6.4916835f,8.0f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,15.0f)
                curveTo(1.9887824f,17.508316f,3.320516f,19.830912f,5.490932f,21.08832f)
                curveTo(7.6613474f,22.345726f,10.338653f,22.345726f,12.5090685f,21.08832f)
                curveTo(14.679483f,19.830912f,16.011217f,17.508316f,16.0f,15.0f)
                curveTo(16.011217f,12.491683f,14.679483f,10.169088f,12.5090685f,8.911681f)
                curveTo(10.338653f,7.654273f,7.6613474f,7.654273f,5.490932f,8.911681f)
                curveTo(3.320516f,10.169088f,1.9887824f,12.491683f,2.0f,15.0f)
            }
}

public val LucideIcons.All.BlendDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Blend: ImageVector
    @Composable get() = BlendDefinition.asImageVector()
