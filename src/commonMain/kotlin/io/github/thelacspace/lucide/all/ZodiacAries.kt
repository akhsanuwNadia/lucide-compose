package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacAries") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.5f)
                curveTo(12.01497f,5.0833507f,13.936102f,3.1100361f,16.351482f,3.0303223f)
                curveTo(18.766863f,2.9506085f,20.813923f,4.792962f,20.988197f,7.203366f)
                curveTo(21.162472f,9.61377f,19.401726f,11.731432f,17.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,12.0f)
                curveTo(4.5982738f,11.731432f,2.8375275f,9.61377f,3.0118022f,7.203366f)
                curveTo(3.1860769f,4.792962f,5.2331367f,2.9506085f,7.648517f,3.0303223f)
                curveTo(10.063898f,3.1100361f,11.98503f,5.0833507f,12.0f,7.5f)
                lineTo(12.0f,21.0f)
            }
}

public val LucideIcons.All.ZodiacAriesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacAries: ImageVector
    @Composable get() = ZodiacAriesDefinition.asImageVector()
