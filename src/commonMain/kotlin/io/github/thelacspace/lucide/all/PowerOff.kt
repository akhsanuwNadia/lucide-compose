package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PowerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(18.36f,6.64f)
                curveTo(20.546402f,8.827468f,21.45646f,11.98435f,20.77f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.16f,6.16f)
                curveTo(3.5547757f,8.348097f,2.4060817f,11.818244f,3.1911936f,15.128616f)
                curveTo(3.9763052f,18.438988f,6.561012f,21.023695f,9.871384f,21.808807f)
                curveTo(13.181756f,22.593918f,16.651903f,21.445225f,18.84f,18.84f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
}

public val LucideIcons.All.PowerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PowerOff: ImageVector
    @Composable get() = PowerOffDefinition.asImageVector()
