package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CreditCardReader") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0f,16.0f)
                lineTo(15.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.963f,7.734f)
                curveTo(16.84334f,7.300356f,16.44885f,6.999988f,15.999f,7.0f)
                lineTo(8.003f,7.0f)
                curveTo(7.553149f,6.999988f,7.158661f,7.300356f,7.0390005f,7.734f)
                lineTo(4.073f,18.467f)
                curveTo(3.906581f,19.068876f,4.030837f,19.713942f,4.4089265f,20.210932f)
                curveTo(4.7870154f,20.707922f,5.37554f,20.99979f,6.0f,21.0f)
                lineTo(18.0f,21.0f)
                curveTo(18.62423f,20.999704f,19.212523f,20.707968f,19.590567f,20.211235f)
                curveTo(19.96861f,19.7145f,20.093044f,19.06974f,19.927f,18.468f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.678f,8.5f)
                curveTo(2.247174f,8.120494f,2.0002215f,7.574139f,2.0f,7.0f)
                lineTo(2.0f,5.0f)
                curveTo(2.0f,3.8954306f,2.8954306f,3.0f,4.0f,3.0f)
                lineTo(20.0f,3.0f)
                curveTo(21.10457f,3.0f,22.0f,3.8954306f,22.0f,5.0f)
                lineTo(22.0f,7.0f)
                curveTo(21.999998f,7.5734754f,21.753822f,8.119359f,21.324f,8.499f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,21.0f)
                lineTo(11.0f,7.0f)
            }
}

public val LucideIcons.All.CreditCardReaderDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CreditCardReader: ImageVector
    @Composable get() = CreditCardReaderDefinition.asImageVector()
