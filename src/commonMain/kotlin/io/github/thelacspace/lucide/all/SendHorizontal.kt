package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SendHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.714f,3.048f)
                curveTo(3.5299408f,2.9581485f,3.3096385f,2.9901536f,3.1587555f,3.1286654f)
                curveTo(3.0078728f,3.267177f,2.9571836f,3.4839444f,3.031f,3.6750002f)
                lineTo(5.8739996f,11.302f)
                curveTo(6.041672f,11.752229f,6.041672f,12.247771f,5.8739996f,12.698f)
                lineTo(3.0319996f,20.325f)
                curveTo(2.958561f,20.515808f,3.0092063f,20.732117f,3.159718f,20.870491f)
                curveTo(3.3102295f,21.008865f,3.530024f,21.041187f,3.7139995f,20.952002f)
                lineTo(21.713999f,12.452002f)
                curveTo(21.888773f,12.369345f,22.000233f,12.193336f,22.000233f,12.000002f)
                curveTo(22.000233f,11.806667f,21.888773f,11.630658f,21.713999f,11.548001f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f,12.0f)
                lineTo(22.0f,12.0f)
            }
}

public val LucideIcons.All.SendHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SendHorizontal: ImageVector
    @Composable get() = SendHorizontalDefinition.asImageVector()
