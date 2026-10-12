package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Handbag") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0480000972747803,18.56599998474121)
                curveTo(1.9163668155670166,19.15814971923828,2.060595989227295,19.77804183959961,2.440107583999634,20.251264572143555)
                curveTo(2.8196194171905518,20.724489212036133,3.393395185470581,20.999895095825195,4.0,21.0)
                lineTo(20.0,21.0)
                curveTo(20.606605529785156,20.999895095825195,21.18037986755371,20.724489212036133,21.559892654418945,20.251264572143555)
                curveTo(21.939403533935547,19.77804183959961,22.083633422851562,19.15814971923828,21.95199966430664,18.56599998474121)
                lineTo(19.95199966430664,9.565999984741211)
                curveTo(19.748624801635742,8.651117324829102,18.93721580505371,8.000161170959473,18.0,8.0)
                lineTo(6.0,8.0)
                curveTo(5.062784671783447,8.000161170959473,4.251375675201416,8.651117324829102,4.047999858856201,9.565999984741211)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(8.0,11.0)
                lineTo(8.0,6.0)
                curveTo(8.009848594665527,3.7978436946868896,9.797821998596191,2.017848491668701,12.0,2.017848491668701)
                curveTo(14.202178001403809,2.017848491668701,15.990151405334473,3.7978436946868896,16.0,6.0)
                lineTo(16.0,11.0)
            }
}

public val LucideIcons.All.HandbagDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Handbag: ImageVector
    @Composable get() = HandbagDefinition.asImageVector()
