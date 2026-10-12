package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ZodiacAries") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.5)
                curveTo(12.014969825744629,5.083350658416748,13.936101913452148,3.1100361347198486,16.351482391357422,3.030322313308716)
                curveTo(18.766862869262695,2.950608491897583,20.813922882080078,4.792962074279785,20.988197326660156,7.203365802764893)
                curveTo(21.162471771240234,9.61376953125,19.40172576904297,11.73143196105957,17.0,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0,12.0)
                curveTo(4.598273754119873,11.73143196105957,2.8375275135040283,9.61376953125,3.0118021965026855,7.203365802764893)
                curveTo(3.1860768795013428,4.792962074279785,5.2331366539001465,2.950608491897583,7.64851713180542,3.030322313308716)
                curveTo(10.063898086547852,3.1100361347198486,11.985030174255371,5.083350658416748,12.0,7.5)
                lineTo(12.0,21.0)
            }
}

public val LucideIcons.All.ZodiacAriesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ZodiacAries: ImageVector
    @Composable get() = ZodiacAriesDefinition.asImageVector()
