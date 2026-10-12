package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Baby") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,16.0f)
                curveTo(10.5f,16.3f,11.2f,16.5f,12.0f,16.5f)
                curveTo(12.8f,16.5f,13.5f,16.3f,14.0f,16.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f,12.0f)
                lineTo(15.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.38f,6.813f)
                curveTo(20.081104f,7.832396f,20.5645f,8.985398f,20.8f,10.2f)
                curveTo(21.489979f,10.534173f,21.928219f,11.233355f,21.928219f,12.0f)
                curveTo(21.928219f,12.7666445f,21.489979f,13.465826f,20.8f,13.799999f)
                curveTo(19.910387f,17.949144f,16.243443f,20.913204f,11.999999f,20.913204f)
                curveTo(7.7565556f,20.913204f,4.089611f,17.949144f,3.1999989f,13.799999f)
                curveTo(2.5100179f,13.465826f,2.0717783f,12.7666445f,2.0717783f,11.999999f)
                curveTo(2.0717783f,11.233354f,2.5100179f,10.534172f,3.1999989f,10.199999f)
                curveTo(4.0539727f,6.016356f,7.730098f,3.0086184f,12.0f,3.0f)
                curveTo(14.0f,3.0f,15.5f,4.1f,15.5f,5.5f)
                curveTo(15.5f,6.9f,14.6f,8.0f,13.5f,8.0f)
                curveTo(12.7f,8.0f,12.0f,7.6f,12.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,12.0f)
                lineTo(9.01f,12.0f)
            }
}

public val LucideIcons.All.BabyDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Baby: ImageVector
    @Composable get() = BabyDefinition.asImageVector()
