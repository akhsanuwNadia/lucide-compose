package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookmarkPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,7.0)
                lineTo(12.0,13.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(9.0,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,3.0)
                curveTo(18.104570388793945,3.0,19.0,3.895430564880371,19.0,5.0)
                lineTo(19.0,20.0)
                curveTo(18.99988555908203,20.35638427734375,18.81011199951172,20.685775756835938,18.501855850219727,20.864627838134766)
                curveTo(18.193601608276367,21.043481826782227,17.81345558166504,21.044767379760742,17.503999710083008,20.868000030517578)
                lineTo(12.991999626159668,18.290000915527344)
                curveTo(12.377276420593262,17.938859939575195,11.622722625732422,17.938859939575195,11.007999420166016,18.290000915527344)
                lineTo(6.495999336242676,20.868000030517578)
                curveTo(6.186542987823486,21.04476547241211,5.806397914886475,21.043481826782227,5.498143196105957,20.864627838134766)
                curveTo(5.1898884773254395,20.685773849487305,5.000114917755127,20.35638427734375,5.0,20.0)
                lineTo(5.0,5.0)
                curveTo(5.0,3.895430564880371,5.895430564880371,3.0,7.0,3.0)
                close()
            }
}

public val LucideIcons.All.BookmarkPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookmarkPlus: ImageVector
    @Composable get() = BookmarkPlusDefinition.asImageVector()
