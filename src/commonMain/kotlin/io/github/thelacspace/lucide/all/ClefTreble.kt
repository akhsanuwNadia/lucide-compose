package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ClefTreble") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.586f,21.414f)
                curveTo(11.207201f,22.034765f,12.160682f,22.17767f,12.936575f,21.766293f)
                curveTo(13.712469f,21.354918f,14.1292305f,20.48552f,13.964001f,19.623f)
                lineTo(11.036f,4.377f)
                curveTo(10.856211f,3.4415462f,11.361131f,2.5091074f,12.242781f,2.148428f)
                curveTo(13.124432f,1.7877485f,14.138113f,2.0989344f,14.665525f,2.892177f)
                curveTo(15.192938f,3.6854198f,15.0877f,4.740555f,14.4140005f,5.4139996f)
                curveTo(12.414f,7.414f,7.0f,8.0f,7.0f,13.0f)
                curveTo(7.0f,15.761424f,9.238576f,18.0f,12.0f,18.0f)
                curveTo(14.761424f,18.0f,17.0f,16.209139f,17.0f,14.0f)
                curveTo(17.0f,12.343145f,15.656855f,11.0f,14.0f,11.0f)
                curveTo(12.343145f,11.0f,11.0f,11.895431f,11.0f,13.0f)
            }
}

public val LucideIcons.All.ClefTrebleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ClefTreble: ImageVector
    @Composable get() = ClefTrebleDefinition.asImageVector()
